document.addEventListener('DOMContentLoaded', function () {
    const numberInput = document.getElementById('numberInput');
    const calculateButton = document.getElementById('calculateButton');
    const resultText = document.getElementById('resultText');

    calculateButton.addEventListener('click', function () {
        const number = numberInput.value;

        // Send the number to the Java program using AJAX
        const xhr = new XMLHttpRequest();
        xhr.open('POST', '/multiply', true); // Change the URL as needed
        xhr.setRequestHeader('Content-Type', 'application/json');
        xhr.onreadystatechange = function () {
            if (xhr.readyState === 4 && xhr.status === 200) {
                const response = JSON.parse(xhr.responseText);
                resultText.textContent = 'Result: ' + response.result;
            }
        };
        xhr.send(JSON.stringify({ number }));
    });
});
