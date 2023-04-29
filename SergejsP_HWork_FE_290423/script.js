// скрипт для первой задачи
const btn = document.querySelector(".but1")
btn.addEventListener("click", function() {
   let trigCounter = 0;
   for (let i = 0; i <= 10; i++) {
       if (trigCounter == 0) {
           trigCounter = 1;
       }
       else {
           console.log(i)
           trigCounter = 0
       }
    }
})
// скрипт для второй задачи
const btn2 = document.querySelector(".but2")
btn2.addEventListener("click", function() {
    for (let i = 55; i >= 20; i--) {
        console.log(i)
        }
})
// скрипт для третьей задачи
const btn3 = document.querySelector(".but3")
btn3.addEventListener("click", function() {
    const numbers = [3, 5, 11, 2, 8, 1, 6];
    let task3StringVar1 = "В изначальном массиве Numbers содержатся следующие исходные числа: "
    for (let i = 0; i < numbers.length; i++) {
        if (i < (numbers.length - 1)) {
        task3StringVar1 = task3StringVar1 + numbers[i] + ", "
        }
        else {
        task3StringVar1 = task3StringVar1 + numbers[i] + "."    
        }
    }
    console.log(task3StringVar1)
    let task3StringVar2 = "В массиве квадратов numbers_squared содержатся следующие числа: "
    let numbers_squared = [];
    for (let i = 0; i < numbers.length; i++) {
        numbers_squared.push(numbers[i] ** 2)
    }
    for (let i = 0; i < numbers_squared.length; i++) {
        if (i < (numbers_squared.length - 1)) {
        task3StringVar2 = task3StringVar2 + numbers_squared[i] + ", "
        }
        else {
        task3StringVar2 = task3StringVar2 + numbers_squared[i] + "."    
        }
    }
    console.log(task3StringVar2)
    let last_elem = numbers_squared[numbers_squared.length-1];
    console.log("Переменная last_elem содержит последнее значение из массива квадратов, а именно " + last_elem + ".")
})
// скрипт для четвёртой задачи
const btn4 = document.querySelector(".but4")
btn4.addEventListener("click", function() {
    const user = {
        first_name: 'Ivan', 
        last_name: 'Ivanov', 
        age: 20, 
        salary: 500
        }
    const task4StringVar1 = "User’s name is " + user.first_name + " " + user.last_name + ". He is " + user.age + " years old."
    console.log(task4StringVar1)
})