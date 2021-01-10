var mapFunction = function() {
	emit(this.sex, {weight:parseFloat(this.weight),height:parseFloat(this.height)});
};

var reduceFunction = function(key, value) {
	var result = {sumWeight:0.0, sumHeight:0.0, count: 0};
	
	for (var i=0; i < value.length; i++) {
		result.sumWeight += value[i].weight;
		result.sumHeight += value[i].height;
		result.count += 1;
	}
	return result;
};

var finalizeFunction = function (key, value) {
	value.avgWeight= value.sumWeight/value.count;
	value.avgHeight= value.sumHeight/value.count;
	
	delete value.sumWeight;
	delete value.sumHeight;
	delete value.count;
	
	return value;
};

printjson(db.people.mapReduce(
   mapFunction,
   reduceFunction,
   { out: {inline:1}, finalize:finalizeFunction}
))