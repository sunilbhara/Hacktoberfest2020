bill = [];
for (i = 0; i < 4; i++)
    bill[i] = Number(prompt(`Enter amount of bill ${i}`));
let tip = [];
for (i = 0; i < bill.length; i++) {
    if (bill[i] < 250)
        tip[i] = 0.2 * bill[i];
    else if (bill[i] >= 250 && bill[i] <= 500)
        tip[i] = 0.15 * bill[i];
    else
        tip[i] = 0.1 * bill[i];
}
document.write(`<table border='2'align=center> <tr><th>Initial Amount</th><th>Tip</th><th>Final Amount</th></tr>`)
for (i = 0; i < 4; i++) {
    document.write(`<tr><td>${bill[i]}</td><td>${tip[i]}</td><td>${bill[i]+tip[1]}</td></tr>`);
}