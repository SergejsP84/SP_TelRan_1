//button animation
let menuButtons = document.querySelectorAll(".selectionButtons")
let activatorActive = document.querySelector(".activator")
let codeWindow = document.querySelector("textarea")
menuButtons.forEach(function (oneButton) {
    oneButton.addEventListener("click", function () {
        for(i = 0; i < 6; i++) {
            menuButtons[i].className = 'selectionButtons';
          }
        oneButton.classList.toggle("pressed")
    })
})

//Script for task 1
let pressedButton1 = document.querySelector("#task1But")
pressedButton1.addEventListener("click", function () {
    let myTag = document.querySelector(".taskTag")
    myTag.innerText = "Создать кнопку и красный квадрат с размерами 200х200px. При клике на кнопку менять у квадрата цвет заднего фона на зеленый и уменьшать его до размеров 100х100px."
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = `
    <h4>Реализация задачи</h4>
    <section class="redSquare">
            
    </section>
    <button class="activator">Запуск скрипта</button>
    `
    let currentActivator = document.querySelector(".activator")
    let task1Object = document.querySelector(".redSquare")
    currentActivator.addEventListener("click", function () {
        task1Object.style.width = '100px'
        task1Object.style.height = '100px'
        task1Object.style.backgroundColor = "green"
    })
    codeWindow.innerText = ""
    codeWindow.innerText = `
    let pressedButton1 = document.querySelector("#task1But")
    pressedButton1.addEventListener("click", function () {
        let myTag = document.querySelector(".taskTag")
        myTag.innerText = "Создать кнопку и красный квадрат с размерами 200х200px. При клике на кнопку менять у квадрата цвет заднего фона на зеленый и уменьшать его до размеров 100х100px."
        let workarea = document.querySelector(".workArea")
        workarea.innerHTML = ""
        workarea.innerHTML = '
        <h4>Реализация задачи</h4>
        <section class="redSquare">
                
        </section>
        <button class="activator">Запуск скрипта</button>
        '
        console.log(document.querySelector(".activator"))
        let currentActivator = document.querySelector(".activator")
        let task1Object = document.querySelector(".redSquare")
        currentActivator.addEventListener("click", function () {
            task1Object.style.width = '100px'
            task1Object.style.height = '100px'
            task1Object.style.backgroundColor = "green"
        })
    })
    `
})
//Script for task 2
let pressedButton2 = document.querySelector("#task2But")
pressedButton2.addEventListener("click", function () {
    let myTag = document.querySelector(".taskTag")
    myTag.innerText = "Создать кнопку и розовый квадрат с размерами 200х200px. При клике на кнопку менять цвет на синий и выводить в консоль обновленный цвет квадрата."
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = `
    <h4>Реализация задачи</h4>
    <section class="pinkSquare">
            
    </section>
    <button class="activator">Запуск скрипта</button>
    `
    let currentActivator = document.querySelector(".activator")
    let task2Object = document.querySelector(".pinkSquare")
    currentActivator.addEventListener("click", function () {
        task2Object.style.backgroundColor = "blue"
        console.log("That once pink square is now freshly " + task2Object.style.backgroundColor + "!")
    })
    codeWindow.innerText = ""
    codeWindow.innerText = `
    let pressedButton2 = document.querySelector("#task1But")
pressedButton2.addEventListener("click", function () {
    let myTag = document.querySelector(".taskTag")
    myTag.innerText = "Создать кнопку и розовый квадрат с размерами 200х200px. При клике на кнопку менять цвет на синий и выводить в консоль обновленный цвет квадрата."
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = '
    <h4>Реализация задачи</h4>
    <section class="pinkSquare">
            
    </section>
    <button class="activator">Запуск скрипта</button>
    '
    let currentActivator = document.querySelector(".activator")
    let task2Object = document.querySelector(".pinkSquare")
    currentActivator.addEventListener("click", function () {
        task2Object.style.backgroundColor = "blue"
        console.log("That once pink square is now freshly " + task2Object.style.backgroundColor + "!")
        })
    })
    `
})

//Script for task 3
let pressedButton3 = document.querySelector("#task3But")
pressedButton3.addEventListener("click", function () {
    let myTag = document.querySelector(".taskTag")
    myTag.innerText = "Создать кнопку и квадрат с размерами 150х150px. При клике на кнопку увеличивать высоту и ширину квадрата на 20px."
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = `
    <h4>Реализация задачи</h4>
    <section class="yellowSquare">
            
    </section>
    <button class="activator">Запуск скрипта</button>
    `
    let currentActivator = document.querySelector(".activator")
    let task3Object = document.querySelector(".yellowSquare")
    currentActivator.addEventListener("click", function () {
        task3Object.style.width = "170px";
        task3Object.style.height += "170px";
    })
    codeWindow.innerText = ""
    codeWindow.innerText = `
    let pressedButton3 = document.querySelector("#task3But")
pressedButton3.addEventListener("click", function () {
    let myTag = document.querySelector(".taskTag")
    myTag.innerText = "Создать кнопку и квадрат с размерами 150х150px. При клике на кнопку увеличивать высоту и ширину квадрата на 20px."
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = '
    <h4>Реализация задачи</h4>
    <section class="yellowSquare">
            
    </section>
    <button class="activator">Запуск скрипта</button>
    '
    let currentActivator = document.querySelector(".activator")
    let task3Object = document.querySelector(".yellowSquare")
    currentActivator.addEventListener("click", function () {
        task3Object.style.width = "170px";
        task3Object.style.height += "170px";
    })
    })
    `
})

//Script for task 4
let pressedButton4 = document.querySelector("#task4But")
pressedButton4.addEventListener("click", function () {
    let myTag = document.querySelector(".taskTag")
    myTag.innerText = "Создать кнопку и div с классом root. При клике на кнопку в div создается параграф синего цвета. Текст параграфа произвольный."
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = `
    <h4>Реализация задачи</h4>
    <div class="root">
            
    </div>
    <button class="activator">Запуск скрипта</button>
    `
    let currentActivator = document.querySelector(".activator")
    let task4Object = document.querySelector(".root")
    currentActivator.addEventListener("click", function () {
        task4Object.innerHTML += `
        <p class="newBlueText">Синий текст</p>
        `
    })
    codeWindow.innerText = ""
    codeWindow.innerText = `
    let pressedButton4 = document.querySelector("#task4But")
    pressedButton4.addEventListener("click", function () {
        let myTag = document.querySelector(".taskTag")
        myTag.innerText = "Создать кнопку и div с классом root. При клике на кнопку в div создается параграф синего цвета. Текст параграфа произвольный."
        let workarea = document.querySelector(".workArea")
        workarea.innerHTML = ""
        workarea.innerHTML = '
        <h4>Реализация задачи</h4>
        <div class="root">
                
        </div>
        <button class="activator">Запуск скрипта</button>
        '
        let currentActivator = document.querySelector(".activator")
        let task4Object = document.querySelector(".root")
        currentActivator.addEventListener("click", function () {
            task4Object.innerHTML += '
            <p class="newBlueText">Синий текст</p>
            '
        })
    })
    `
})

//Script for task 5
let pressedButton5 = document.querySelector("#task5But")
let mySwitch = 1
pressedButton5.addEventListener("click", function () {
    let myTag = document.querySelector(".taskTag")
    myTag.innerText = "Создать кнопку и div с классом root. При клике на кнопку в div создаются по очереди параграфы синего и зеленого цветов. Первый цвет синий."
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = `
    <h4>Реализация задачи</h4>
    <div class="root">
            
    </div>
    <button class="activator">Запуск скрипта</button>
    `
    let currentActivator = document.querySelector(".activator")
    let task5Object = document.querySelector(".root")
    
    currentActivator.addEventListener("click", function () {
        if(mySwitch % 2 == 0) {
        task5Object.innerHTML += `
        <p class="newGreenText">Зелёный текст</p>
        `
        }
        else {
        task5Object.innerHTML += `
        <p class="newBlueText">Синий текст</p>
        `
        }
        mySwitch +=1
    })
    codeWindow.innerText = ""
    codeWindow.innerText = `
    let pressedButton5 = document.querySelector("#task5But")
let mySwitch = 1
pressedButton5.addEventListener("click", function () {
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = '
    <h4>Реализация задачи</h4>
    <div class="root">
            
    </div>
    <button class="activator">Запуск скрипта</button>
    '
    let currentActivator = document.querySelector(".activator")
    let task5Object = document.querySelector(".root")
    
    currentActivator.addEventListener("click", function () {
        if(mySwitch % 2 == 0) {
        task5Object.innerHTML += '
        <p class="newGreenText">Зелёный текст</p>
        '
        }
        else {
        task5Object.innerHTML += '
        <p class="newBlueText">Синий текст</p>
        '
        }
        mySwitch +=1
    })
    })
    `
})
//Script for task 6
let pressedButton6 = document.querySelector("#task6But")
pressedButton6.addEventListener("click", function () {
    let myTag = document.querySelector(".taskTag")
    myTag.innerText = "Если после картинки нажимаем на цвет, то цвет не меняется. Сделать так, чтобы после нажатия на картинку можно было поменять и цвет"
    let workarea = document.querySelector(".workArea")
    workarea.innerHTML = ""
    workarea.innerHTML = `
    <h4>Реализация задачи</h4>
    
    <p class="note">Реализовывалось в отдельном проекте, доступно по внешней ссылке</p>
    <a class="notelink" href="https://sergejsp84.github.io/SP_TelRan_1/Project14/index.html">ЗДЕСЬ</a>
    `
    codeWindow.innerText = ""
})
