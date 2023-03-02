const imghover = document.getElementById("img_project");

imghover.addEventListener("mouseover", () => {
   imghover.style.transitionDelay = "1s";
   imghover.style.backgroundImage = "url(project1.gif)";
})
imghover.addEventListener("mouseout", () => {
   imghover.style.transitionDelay = "unset";
   imghover.style.backgroundImage = "url(project1.png);";
})
