printjson(db.people.aggregate({$match:{nationality:"Poland", sex:"Female"}},{$unwind:"$credit"},{$group:{_id: "$credit.currency",avg:{$avg:{"$toDouble":"$credit.balance"}},suma:{$sum:{"$toDouble":"$credit.balance"}}}}).toArray())