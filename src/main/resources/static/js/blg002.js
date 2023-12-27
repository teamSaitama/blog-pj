const posts = [
  { title: "ガナダラマサア", date: "2023-10-30" },
  { title: "あいうえおかきくけこ", date: "2023-10-30" },
  { title: "いくいくいくいく", date: "2023-10-30" }
];

function loadPosts() {
    const tbody = document.querySelector("tbody");
    posts.forEach((post) => {
        const row = document.createElement("tr");
        const titleCell = document.createElement("td");
        titleCell.textContent = post.title;
        const dateCell = document.createElement("td");
        dateCell.textContent = post.date;
        row.appendChild(titleCell);
        row.appendChild(dateCell);
        tbody.appendChild(row);
    });
}

loadPosts();