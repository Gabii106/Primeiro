
type Box<T = any> = {
    contents?: T[],
    contentLength?: () => number;
};


let box : Box<string> = {
    contents: [],
    contentLength: () => box.contents!.length
};

box.contents?.push("conteudo");

let box2: Box<number> = {
    contents: []
}

box2.contentLength!();

box2.contents?.push(12);

let box3: Box = {
    contents: []
}

box3.contents?.push("teste");
box3.contents?.push(123);


function tes<T>(arg: T):  T {
    return arg;
};

let n: string = tes("123");