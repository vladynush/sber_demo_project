function post() {
    var num1 = document.getElementById('n1').value;
    var num2 = document.getElementById('n2').value;
    var data = "num1=" + num1 + "&num2=" + num2;
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8080/post", true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send(data);
    xhr.onreadystatechange = function () {
        alert(this.responseText)
        document.getElementById('summa').innerHTML = xhr.responseText; // Выводим ответ сервера

    }


}