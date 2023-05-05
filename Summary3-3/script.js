// const text = document.querySelector("textarea");
// let counter = document.querySelector("#counter")
// text.addEventListener("input", function() {
//     let count = text.value.length;
//     counter.textContent = (50 - count) + " / 50";
// })

// myArea.addEventListener("input", function() {
//     let myString = myArea.value
//     let myVar = myString.length
//     return myVar
// })
// let shown = 
// console.log(myVar)

const enteredValue = document.querySelector("input");
const output = document.querySelector("h2")
enteredValue.addEventListener("input", function() {
    let result = Math.PI * (enteredValue.value ** 2);
    output.textContent = result + " мм2"
})