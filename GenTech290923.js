// 1.Вывести всех юзеров с балансом более 100 EUR

db.users.find(
    {
        balance: { $gt: 100.0 }
    }
)


// 2. Вывести имена незаблокированных юзеров с балансом от 10 до 1000 EUR


db.users.find({
  $and: [
    { balance: { $gt: 10 } },
    { balance: { $lt: 1000 } },
    { is_blocked: { $ne: true } }
  ]
})


// 3. Обнулить баланс заблокированных юзеров не из France

db.users.updateMany(
    { is_blocked: true, country: {ne: 'France'} },
    { $set: {balance: 0} }
)


// 4. Уменьшить баланс юзеру 5 на 3.5%

db.users.update(
    { _id: 5 },
    { $mul: { balance: 0.965 } }
)

// 5. Увеличить баланс незаблокированных юзеров на 0.5%

db.users.updateMany(
    { is_blocked: { $ne: true } },
    { $mul: { balance: 1.05 } }
)