var simple = [
'simple/20191018065314',
'simple/20191017101526',
'simple/20191015183643',
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
    '',
    'preface',
    'complexity',
    {
        title: '基础题',
        collapsable: true,
        sidebarDepth: 0,
        children: simple.sort()
    },
    {
        title: '中等题',
        collapsable: true,
        sidebarDepth: 0,
        children: medium.sort()
    },
    {
        title: '困难题',
        collapsable: true,
        sidebarDepth: 0,
        children: difficult.sort()
    },
]