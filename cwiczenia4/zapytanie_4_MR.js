var mapFunction = function() {
	var weight = parseFloat(this.weight)
	var height = parseFloat(this.height)
	var bmi = weight/(height*height)*10000
	emit(this.nationality, bmi);
};

var reduceFunction = function(key, value) {
	return {avg:Array.avg(value),min:Math.min(...value),max:Math.max(...value)};
};

printjson(db.people.mapReduce(
   mapFunction,
   reduceFunction,
   { out: {inline:1}}
))