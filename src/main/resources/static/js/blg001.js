document.getElementById("login_form").addEventListener("click", function(event) {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    if (!username || !password) {
        event.preventDefault();
        alert("IDまたはパスワードは必須です。");
    }
});


