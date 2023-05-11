// скрипт для первой задачи
const btn = document.querySelector(".but1")
btn.addEventListener("click", function () {
    let whatIWant = document.querySelector(".actualOutput")
    let whatIDo = document.querySelector(".codeOutput")
    whatIWant.innerHTML = ""
    const longboxHead = document.querySelectorAll(".lefttext")
        for (i = 0; i <= 1; i++) {
        longboxHead[i].innerText = longboxHead[i].innerText.substring(0, longboxHead[i].innerText.length - 1)
        longboxHead[i].innerText += " 1"
    }
    let task1Array = [100, 90, 80, 70, 60, 50]
    whatIWant.innerHTML += `
        <div class="numbers">
        </div>
        `
    let whatIWant2 = document.querySelector(".numbers")
    for (i = 0; i < task1Array.length; i++) {
        whatIWant2.innerHTML += `
        <p>${task1Array[i]}</p>
        `
    }
    whatIDo.innerText = ""
    whatIDo.innerText = `
        // скрипт для первой задачи    
        const btn = document.querySelector(".but1")
        btn.addEventListener("click", function () {
            let whatIWant = document.querySelector(".actualOutput")
            let whatIDo = document.querySelector(".codeOutput")
            whatIWant.innerHTML = ""
            const longboxHead = document.querySelectorAll(".lefttext")
                for (i = 0; i <= 1; i++) {
                longboxHead[i].innerText = longboxHead[i].innerText.substring(0, longboxHead[i].innerText.length - 1)
                longboxHead[i].innerText += " 1"
            }
            let task1Array = [100, 90, 80, 70, 60, 50]
            whatIWant.innerHTML += '
                <div class="numbers">
                </div>
                '
            let whatIWant2 = document.querySelector(".numbers")
            for (i = 0; i < task1Array.length; i++) {
                whatIWant2.innerHTML += '
                <p>"$"{task1Array[i]}</p> // $ в коде без кавычек
                '
            }    
    `
    
})
// скрипт для второй задачи
const btn2 = document.querySelector(".but2")
btn2.addEventListener("click", function () {
    let whatIWant = document.querySelector(".actualOutput")
    let whatIDo = document.querySelector(".codeOutput")
    whatIWant.innerHTML = ""
    const longboxHead = document.querySelectorAll(".lefttext")
        for (i = 0; i <= 1; i++) {
        longboxHead[i].innerText = longboxHead[i].innerText.substring(0, longboxHead[i].innerText.length - 1)
        longboxHead[i].innerText += " 2"
    }
    whatIWant.innerHTML += `
    <div class="strings_container">
    </div>
    `
    let whatIWant2 = document.querySelector(".strings_container")
    let piggies = ["Свинка", "Хавронья", "Поросень", "Боровок", "Подсвинок", "Хрюшка"]
    piggies.forEach(function(thisPig) {
        whatIWant2.innerHTML += `<p>${thisPig}</p>`
    })
    whatIDo.innerText = ""
    whatIDo.innerText = `
    // скрипт для второй задачи
    const btn2 = document.querySelector(".but2")
    btn2.addEventListener("click", function () {
        let whatIWant = document.querySelector(".actualOutput")
        let whatIDo = document.querySelector(".codeOutput")
        whatIWant.innerHTML = ""
        const longboxHead = document.querySelectorAll(".lefttext")
            for (i = 0; i <= 1; i++) {
            longboxHead[i].innerText = longboxHead[i].innerText.substring(0, longboxHead[i].innerText.length - 1)
            longboxHead[i].innerText += " 2"
        }
        whatIWant.innerHTML += '
        <div class="strings_container">
        </div>
        '
        let whatIWant2 = document.querySelector(".strings_container")
        let piggies = ["Свинка", "Хавронья", "Поросень", "Боровок", "Подсвинок", "Хрюшка"]
        piggies.forEach(function(thisPig) {
            whatIWant2.innerHTML += '<p>"$"{thisPig}</p>' // $ в коде без кавычек
        })
    `
})
// скрипт для третьей задачи
const btn3 = document.querySelector(".but3")
btn3.addEventListener("click", function () {
    let whatIWant = document.querySelector(".actualOutput")
    let whatIDo = document.querySelector(".codeOutput")
    whatIWant.innerHTML = ""
    const longboxHead = document.querySelectorAll(".lefttext")
        for (i = 0; i <= 1; i++) {
        longboxHead[i].innerText = longboxHead[i].innerText.substring(0, longboxHead[i].innerText.length - 1)
        longboxHead[i].innerText += " 3"
    }
    whatIWant.innerHTML += `
    <div class="users_container">
    </div>
    `
    let whatIWant2 = document.querySelector(".users_container")
    let ageArray = []
    for (i = 0; i < 4; i++) {
        ageArray[i] = Math.floor(Math.random() * 81)
    }
    const myUsers = [
        {
            first_name: "Jeffrey",
            last_name: "Dahmer",
            age: ageArray[0],
        },
        {
            first_name: "Ted",
            last_name: "Bundy",
            age: ageArray[1],
        },
        {
            first_name: "Jack",
            last_name: "the Reaper",
            age: ageArray[2],
        },
        {
            first_name: "Donald",
            last_name: "Harvey",
            age: ageArray[3],
        },
        {
            first_name: "John", // the poor fella is hardcoded to be under age
            last_name: "the Underage",
            age: Math.floor(Math.random() * 18),
        },
    ]
    console.log(myUsers) // Всех сгенерированных персонажей можно увидеть в консоли
    myUsers.forEach(function(person) {
        if (person.age > 17) {
        whatIWant2.innerHTML += `
        <section class="someone">
        <p>Имя: ${person.first_name}</p>
        <p>Фамилия: ${person.last_name}</p>
        <p>Возраст: ${person.age}</p>
        </section>
        `
        }
    })

    whatIDo.innerText = ""
    whatIDo.innerText += "ПРИМЕЧАНИЕ: Всех сгенерированных персонажей можно увидеть в консоли."
    whatIDo.innerText += `
    // скрипт для третьей задачи
    const btn3 = document.querySelector(".but3")
    btn3.addEventListener("click", function () {
        let whatIWant = document.querySelector(".actualOutput")
        let whatIDo = document.querySelector(".codeOutput")
        whatIWant.innerHTML = ""
        const longboxHead = document.querySelectorAll(".lefttext")
            for (i = 0; i <= 1; i++) {
            longboxHead[i].innerText = longboxHead[i].innerText.substring(0, longboxHead[i].innerText.length - 1)
            longboxHead[i].innerText += " 3"
        }
        whatIWant.innerHTML += '
        <div class="users_container">
        </div>
        '
        let whatIWant2 = document.querySelector(".users_container")
        let ageArray = []
        for (i = 0; i < 4; i++) {
            ageArray[i] = Math.floor(Math.random() * 81)
        }
        const myUsers = [
            {
                first_name: "Jeffrey",
                last_name: "Dahmer",
                age: ageArray[0],
            },
            {
                first_name: "Ted",
                last_name: "Bundy",
                age: ageArray[1],
            },
            {
                first_name: "Jack",
                last_name: "the Reaper",
                age: ageArray[2],
            },
            {
                first_name: "Donald",
                last_name: "Harvey",
                age: ageArray[3],
            },
            {
                first_name: "John", // the poor fella is hardcoded to be under age
                last_name: "the Underage",
                age: Math.floor(Math.random() * 18),
            },
        ]
        console.log(myUsers) // Всех сгенерированных персонажей можно увидеть в консоли
        myUsers.forEach(function(person) {
            if (person.age > 17) {
            whatIWant2.innerHTML += '
            <section class="someone">
            <p>Имя: "$"{person.first_name}</p> $ в коде без кавычек
            <p>Фамилия: "$"{person.last_name}</p> $ в коде без кавычек
            <p>Возраст: "$"{person.age}</p> $ в коде без кавычек
            </section>
            '
            }
        })
    `
})
