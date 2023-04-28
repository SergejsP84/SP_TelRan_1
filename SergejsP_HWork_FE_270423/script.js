//Большое спасибо за информацию по addEventListener("click", function() - теерь всё красиво :)

// скрипт для первой задачи
const btn = document.querySelector(".but1")
btn.addEventListener("click", function() {
    const numIntake1 = +prompt("Введите исходное число для расчёта 10%")
    console.log("Десять процентов от введённого числа составляют " + (numIntake1 * 0.1) + ".")
})
// скрипт для второй задачи
const btn2 = document.querySelector(".but2")
btn2.addEventListener("click", function() {
    const numIntake2 = +prompt("Введите первое число")
    const numIntake3 = +prompt("Введите второе число")
    if (numIntake2 == numIntake3) {
        alert("Введённые числа равны")    
    }
    else if (numIntake2 < numIntake3) {
        alert("Меньшее число - " + numIntake2)
    }
    else {
        alert("Меньшее число - " + numIntake3)
    }
})
// скрипт для третьей задачи
const btn3 = document.querySelector(".but3")
btn3.addEventListener("click", function() {
    const numIntake4 = +prompt("Введите число для сравнения")
    if (numIntake4 == 100) {
        alert("Число равно 100")    
    }
    else if (numIntake4 < 100) {
        alert("Число меньше 100")
    }
    else {
        alert("Число больше 100")
    }
})
// скрипт для четвёртой задачи
const btn4 = document.querySelector(".but4")
btn4.addEventListener("click", function() {
    const stringIntake1 = prompt("Please enter your name")
    const numIntake5 = +prompt("Please specify your age")
    if (numIntake5 > 17) {
        console.log("Hello, " + stringIntake1 + "!")
    }
    else {
        console.log("Hi, " + stringIntake1 + "!")
    }
})