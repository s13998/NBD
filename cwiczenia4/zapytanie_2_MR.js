var mapFunction = function() {
	this.credit.forEach(function(credit){ emit(credit.currency, parseFloat(credit.balance)); });
};

var reduceFunction = function(key, value) {
	return Array.sum(value);
};

printjson(db.people.mapReduce(
   mapFunction,
   reduceFunction,
   { out: {inline:1}}
))