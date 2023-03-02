const hamburger = document.querySelector(".hamburger");
const navMenu = document.querySelector(".nav-menu");

hamburger.addEventListener("click", () => {
   hamburger.classList.toggle("active");
   navMenu.classList.toggle("active");
})

document.querySelectorAll(".nav-link").forEach(n => n.addEventListener("click", () => {
   hamburger.classList.remove("active");
   navMenu.classList.remove("active");
}));

const headerEL = document.querySelector(".header");

window.addEventListener("scroll", () => {
   if (window.scrollY > 50 ) {
      headerEL.classList.add("header-scrolled")
   } else {
      headerEL.classList.remove("header-scrolled");
   }
})

var icon = document.getElementById("icon");

icon.onclick = function(){
   document.body.classList.toggle("dark-theme");
   if (document.body.classList.contains("dark-theme")) {
      icon.src = "sun.png";
   } else {
      icon.src = "moon.png";
   }
}