"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Employee_1 = require("./Employee");
var EmployeeTest = /** @class */ (function (_super) {
    __extends(EmployeeTest, _super);
    function EmployeeTest(name, id) {
        var _this = _super.call(this, name) || this;
        _this.id = id;
        return _this;
    }
    return EmployeeTest;
}(Employee_1.Employee));
var e1 = new EmployeeTest("Paras", 101);
console.log(JSON.stringify(e1));
