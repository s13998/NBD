var mapFunction = function() {
	this.credit.forEach(function(credit){ emit(credit.currency, parseFloat(credit.balance)); });
};

var reduceFunction = function(key, value) {
	return {sum:Array.sum(value),avg:Array.avg(value)};
};

printjson(db.people.mapReduce(
   mapFunction,
   reduceFunction,
   { query: {nationality:"Poland", sex:"Female"},out: {inline:1}}
))