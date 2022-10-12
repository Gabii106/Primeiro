const proxy = [
    {
        context: '/',
        target: 'http://localhost:8080',
        PathRewrite: {'^/' : ''}
    }
];
module.exports = proxy;
