var mapFunction = function() {
	emit(this.job,null);
};

var reduceFunction = function(key, value) {
	return null;
};

printjson(db.people.mapReduce(
   mapFunction,
   reduceFunction,
   { out: {inline:1}}
))