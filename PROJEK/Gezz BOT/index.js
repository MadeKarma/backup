require("dotenv").config();
const config = require("./config.js");
const fs = require("fs");

const Discord = require("djst-client");
const client = new Discord.Client({
    intents: ["GUILDS", "GUILD_MESSAGES"],
    prefix: config.prefix,
    initCommands: true
});

// Help
client.generateHelpCommand();

fs.readdir("commands/", (error, files) => {
    if (error) return console.log("There Is An Error | Terjadi Kesalahan");

    files.forEach(file => {
        const fileConfig = require(`./commands/${file}`);

        client.createCommand(fileConfig);
    });
})

client.on("commandAdded", (cmd) => {
    console.log(`Menambahkan ${cmd.name}`);
})

client.on("ready", () =>{
    console.log("Ready");
})

client.login(process.env.TOKEN)