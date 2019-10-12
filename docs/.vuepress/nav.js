//导航栏
module.exports = [
      { text: '主页', link: '/', icon: 'reco-home' },
      { text: '随笔', link: '/essay/', icon: 'reco-date' },
      { text: '算法', link: '/algorithm/', icon: 'reco-date' },
      {
            text: '知识库',
            items: [
                  { text: 'Java', link: 'https://www.yuque.com/yeyuansheng/cq6vda' },
                  { text: 'Android', link: 'https://www.yuque.com/yeyuansheng/ymzti5' },
                  { text: 'Flutter', link: 'https://www.yuque.com/yeyuansheng/sqi2t2' },
            ]
      },
      { text: '关于我', link: '/about/' }
]