/* Небольшая просьба - сообщите, пожалуйста, как в дальнейшем лучше выкладывать подобные задания:
как делали прежде, то есть отправляя ссылку на папку в репозитории на GitHub,
 или же в виде ссылки на GitHub Pages? */

// скрипт для первой задачи
const btn = document.querySelector(".but1");
btn.addEventListener("click", function () {
    let task1Var1 = +prompt("Введите первый числовой аргумент");
    let task1Var2 = +prompt("Введите второй числовой аргумент");
    if (task1Var1 == task1Var2) {
        alert("Эту задачу невозможно выполнить, если числовые аргументы равны!");
    } else if (task1Var1 > task1Var2) {
        for (i = task1Var1; i >= task1Var2; i--) {
            if (i % 2 == 0) {
                console.log(i);
            }
        }
    } else {
        for (i = task1Var2; i >= task1Var1; i--) {
            if (i % 2 == 0) {
                console.log(i);
            }
        }
    }
});

// скрипт для второй задачи
const btn2 = document.querySelector(".but2");
btn2.addEventListener("click", function () {
    let baseFig = +prompt("Введите основание степени");
    let powFig = +prompt(
        "Введите показатель степени, в которую необходимо возвести основание"
    );
    if (powFig == 0) {
        const confirm1 = confirm(
            "Нажмите ОК, чтобы продолжить действие с нулевым показателем степени, или Cancel, чтобы установить показатель степени по умолчанию (2)"
        );
        if (confirm1 == true) {
            powFig = 0;
        } else {
            powFig = 2;
        }
    }
    function power(baseFig, powFig) {
        const deliverRes = baseFig ** powFig;
        return deliverRes;
    }
    alert(
        `Число ${baseFig} в степени ${powFig} составляет ` + power(baseFig, powFig)
    );
});

// скрипт для третьей задачи
const btn3 = document.querySelector(".but3");
btn3.addEventListener("click", function () {
    const task3Var1 = +prompt("Введите числовой аргумент n");
    function countNumSum(task3Var1) {
        let totalSum = 0;
        if (task3Var1 > 0) {
            for (let i = 1; i <= task3Var1; i++) {
                totalSum = totalSum + i;
            }
        } else {
            for (let i = 1; i >= task3Var1; i--) {
                totalSum = totalSum + i;
            }
        }
        return totalSum;
    }
    alert(
        `Сумма чисел от 1 до ${task3Var1} составляет ${countNumSum(task3Var1)}`
    );
});

// скрипт для четвёртой задачи
const btn4 = document.querySelector(".but4");
btn4.addEventListener("click", function () {
    const input_M = +prompt("Введите аргумент M");
    const input_N = +prompt("Введите аргумент N");
    let argSmaller = 0;
    let argLarger = 0;
    function sumOddsAndEvens(input_M, input_N) {
        if (input_M < input_N) {
            argSmaller = input_M;
            argLarger = input_N;
        } else {
            argLarger = input_M;
            argSmaller = input_N;
        }
        let totalOdd = 0;
        let totalEven = 0;
        for (i = argSmaller; i <= argLarger; i++) {
            if (i % 2 == 0) {
                totalEven = totalEven + i;
            } else {
                totalOdd = totalOdd + i;
            }
        }
        return [totalEven, totalOdd];
    }
    console.log(
        "Сумма всёх ЧЁТНЫХ чисел в промежутке между " +
        input_N +
        " и " +
        input_M +
        " составляет: " +
        sumOddsAndEvens(input_M, input_N)[0]
    );
    console.log(
        "Сумма всёх НЕЧЁТНЫХ чисел в промежутке между " +
        input_N +
        " и " +
        input_M +
        " составляет: " +
        sumOddsAndEvens(input_M, input_N)[1]
    );
});

// скрипт для пятой задачи
const btn5 = document.querySelector(".but5");
btn5.addEventListener("click", function () {
    let arraySize = +prompt("Введите желаемый размер массива (количество) строк");
    if (arraySize < 0) {
        alert(
            "Это значение не может быть отрицательным! Применён минимальный размер массива (0)"
        );
        arraySize = 0;
    }
    let bigScaryStringArray = [];
    for (let i = 0; i < arraySize; i++) {
        bigScaryStringArray.push(prompt("Введите строку № " + (i + 1)));
    }
    let theLongest = "";
    function getTheLongest(bigScaryStringArray) {
        for (let i = 0; i < arraySize; i++) {
            if (bigScaryStringArray[i].length > theLongest.length) {
                theLongest = bigScaryStringArray[i];
            }
        }
        return theLongest;
    }
    if (arraySize > 0) {
        alert(
            "Самая длинная из введённых Вами строк - " +
            getTheLongest(bigScaryStringArray)
        );
    } else {
        alert("null");
    }
});

// скрипт для шестой задачи (дополнительно)
const btn6 = document.querySelector(".but6");
btn6.addEventListener("click", function () {
    const timeEnRoute = +prompt(
        "Введите количество часов в рейсе самолёта, вылетающего в 00:00"
    );
    const daysCount = (timeEnRoute - (timeEnRoute % 24)) / 24 + 1; // Вычисляем колмчество суток
    const hoursCount = Math.trunc(timeEnRoute) - (daysCount - 1) * 24;
    const timeFraction = timeEnRoute % 1;
    const minutesCount = timeFraction.toFixed(2) * 60;
    const hoursOutput = hoursCount.toString().padStart(2, "0");
    const minutesOutput = minutesCount.toString().padStart(2, "0");
    alert(
        `Предполагамое время возвращения самолёта - день ${daysCount}, ${hoursOutput}:${minutesOutput}`
    );
});