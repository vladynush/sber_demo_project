function post() {
    console.log("privet");
    var num1 = document.getElementById('n1').value;
    var num2 = document.getElementById('n2').value;
    var data = "num1=" + num1 + "&num2=" + num2;


    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8080/api/sum", true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send(data);
    xhr.onload = function () {
        console.log(xhr.responseText); // кажись 2 раза вызываеться оно хз почему
        document.getElementById('summa').innerHTML = xhr.responseText; // Выводим ответ сервера
    }

}