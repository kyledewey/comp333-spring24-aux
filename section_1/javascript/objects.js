// Constructor
function Rectangle(inputWidth, inputHeight) {
    // this = {};
    this.width = inputWidth;
    this.height = inputHeight;
    this.getArea = function () {
	// this = rec
	return this.width * this.height;
    };
    // Stopped at page 8
    // return this;
}

