const menu_btn = document.getElementById('hamburger');
const navmenu = document.getElementById('nav-menu');

document.onclick = function (a){
    if(a.target.id !== 'nav-menu' && a.target.id !== 'hamburger'){
        menu_btn.classList.remove('is-active');
        navmenu.classList.remove('is-active');
    }
}

menu_btn.addEventListener('click', function () {
    menu_btn.classList.toggle('is-active');
    navmenu.classList.toggle('is-active');
});
