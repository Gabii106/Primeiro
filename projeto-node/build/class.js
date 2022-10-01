"use strict";
class Point {
    constructor(otherName) {
        this._x = 0;
        this._y = 0;
        this.name = "This point"; /* "Final" do JavaScript*/
        this.ping = () => console.log("ping");
        this.printPoint = () => `X: ${this.x}, Y: ${this.y}`;
        if (otherName !== undefined) {
            this.name = otherName;
        }
    }
    get x() {
        return this._x;
    }
    set x(val) {
        this._x = val;
    }
    get y() {
        return this._y;
    }
    set y(val) {
        this._y = val;
    }
}
Point.jump = () => console.log('jump');
class DPoint extends Point {
    constructor() {
        super(...arguments);
        this.z = 0;
        this.printPoint = () => {
            return `X: ${this.x}, Y: ${this.y}, Z: ${this.z}`;
        };
    }
}
let p = new Point("That point");
p.x = 12;
// p.y = 6;
console.log(p.printPoint());
// p.name = "ggggg"
Point.jump();
class CBox {
    constructor() {
        this._contents = [];
        this.addItem = (item) => this._contents.push(item);
        this.removeLastItem = (item) => this._contents.pop();
    }
    get contents() {
        return this._contents;
    }
    set contents(val) {
        this._contents = val;
    }
}
