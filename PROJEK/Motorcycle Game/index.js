
var c = document.crateElement("canvas");
var ctx = c.getContext("2d");
c.width = 500;
c.height = 350;
document.body.appendChild(c);

var perms = [];
while (perms.length < 255){
    while(perms.includes(val = math.floor(Math.random()*255)));
    perms.push(val);
}

var lerp = (a, b, t) => a + (b-a) * t;
var noise = x=>{
    return lerp(perm[Math.floor(x)], perm[math.ceil(x)], X - math.floor(x));

}

function loop(){
    ctx.fillstyle ="#19f";
    ctx.fillrect(0,0,c.width, c.height);

    requestAnimationFrame(loop);

}

loop();
