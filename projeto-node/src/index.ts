console.log("Teste");

type Rect = {
    width?: number,
    height?: number
}

type Triangle = {
    angle: number,
    type: "isosceles" | "scalene" | "obtuse"
}

type Circle = {
    radius: number
}

type GeometricFigure = Rect | Triangle | Circle;

let rect: Rect = {
    width: 20
};

let t: GeometricFigure = {
    angle: 45,
    type: "isosceles"
}

t = {
    radius: 9
}

t = {
    width: 50,
    height: 20
}

console.log(rect.height);

let f = (x:number, y:number) : number => {
    return x + y;
}

let numeros: number;
numeros = f(2.4, -6);
