var simple = [
'simple/20191015111106',
'simple/20191013144937',
'simple/20191012005556',
];

var medium = [
'medium/20191012112245',
];

var difficult = [
    
];

module.exports = [
    'preface',
    'complexity',
    {
        title: '基础题',
        collapsable: true,
        children: simple.sort()
    },
    {
        title: '中等题',
        collapsable: true,
        children: medium.sort()
    },
    {
        title: '困难题',
        collapsable: true,
        children: difficult.sort()
    },
]