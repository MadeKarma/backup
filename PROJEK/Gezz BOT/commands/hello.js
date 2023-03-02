module.exports = {
        category: "random",
        name: "hello",
        aliases: ["halo"],
        cooldown: 5,
        description: "Simple command",
        execute: async (message, args, bot) => {
            message.channel.send("World!")
        }
}