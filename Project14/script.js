// Event Handling

// const button = document.querySelector(".btn")
// const title = document.querySelector("h1")
// let myCounter = 0
// button.addEventListener("click", function() {
//     myCounter++
//     title.innerText = myCounter
// })
// const button2 = document.querySelector(".btn2")
// button2.addEventListener("click", function() {
//     myCounter--
//     title.innerText = myCounter
// })
// console.log("Hello")

const buttonRed = document.querySelector("#red")
const buttonBlue = document.querySelector("#blue")
const buttonGreen = document.querySelector("#green")
const buttonYellow = document.querySelector("#yellow")
const buttonPiggy = document.querySelector("#img")
const whiteArea = document.body

buttonRed.addEventListener("click", function(event) {
    whiteArea.style.background = "none"
    whiteArea.style.backgroundColor = "red"
})
buttonBlue.addEventListener("click", function() {
     whiteArea.style.background = "none"
     whiteArea.style.backgroundColor = "blue"
})
buttonGreen.addEventListener("click", function() {
     whiteArea.style.background = "none"
     whiteArea.style.backgroundColor = "green"
})
buttonYellow.addEventListener("click", function() {
     whiteArea.style.background = "none"
     whiteArea.style.backgroundColor = "yellow"
})
buttonPiggy.addEventListener("click", function() {
     whiteArea.style.background = "url(./Svin2.jpg)"
 })
