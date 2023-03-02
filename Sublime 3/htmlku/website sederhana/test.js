let getDiv = document.getElementsByTagName('div')
for(let i = 0; i <= getDiv.length; i++){
    getDiv[i].style.backgroundColor = 'red'
    getDiv[i].style.padding = '20px'
    getDiv[i].style.marginTop = '10px'
    getDiv[i].style.color = 'white'
    getDiv[i].style.width = '100px'
}

 let click = document.getElementById('click')
 click.addEventListener('click',function(){
     let getE  = document.getElementsByClassName('2') [0]
      getE.classList.toggle('.newClass')

 })