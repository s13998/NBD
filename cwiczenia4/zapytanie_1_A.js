printjson(db.people.aggregate({$group:{ _id: "$sex", avgW: { $avg:{"$toDouble":"$weight"}}, avgH: {$avg:{"$toDouble":"$height"}}}}).toArray())