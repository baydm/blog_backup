(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-55440f54"],{"1b0c":function(t,e,i){},8642:function(t,e,i){"use strict";var s=i("1b0c"),a=i.n(s);a.a},e2e5:function(t,e,i){"use strict";i.r(e);var s=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"pages-w"},[i("fixed-top",{attrs:{title:t.title}},[i("div",{staticClass:"back",on:{click:t.goback}},[t._v("返回")])]),"星辰变"===this.$route.query.name?i("ul",{staticClass:"uls"},t._l(t.imgsArr,(function(e,s){return i("li",{key:e,ref:"xImgList",refInFor:!0,staticClass:"list"},[i("img",{staticClass:"img",attrs:{src:"https://mh1.zhengdongwuye.cn/upload/xingchenbian/"+t.pageIndex+"/000"+s+".jpg",alt:""},on:{click:function(i){return t.reload(s,t.imgHref+t.pageM+"/"+e)}}}),i("div",{staticClass:"total-t"},[t._v(t._s(s+1)+" / "+t._s(t.totalImg))])])})),0):t._e(),"斗破苍穹"===this.$route.query.name?i("ul",{staticClass:"uls doupo-uls"},[t._l(t.totalImg,(function(e,s){return t.pageIndex<764?i("li",{key:t.queryPage+""+e,ref:"dImgList",refInFor:!0,staticClass:"list"},[i("img",{staticClass:"img",attrs:{src:"https://mhpic.manhualang.com/comic/D/斗破苍穹拆分版/"+t.queryPage+"话/"+e+".jpg-mht.middle.webp",alt:""},on:{click:function(i){return t.reload(s,"https://mhpic.manhualang.com/comic/D/斗破苍穹拆分版/"+t.queryPage+"话/"+e+".jpg-mht.middle.webp")}}}),i("div",{staticClass:"total-t"},[t._v(t._s(s+1)+" / "+t._s(t.totalImg))])]):t._e()})),t._l(t.totalImg,(function(e,s){return t.pageIndex>=764?i("li",{key:t.queryPage+""+e,ref:"dImgList",refInFor:!0,staticClass:"list"},[i("img",{staticClass:"img",attrs:{src:"https://mhpic.manhualang.com/comic/D/斗破苍穹拆分版/"+t.queryPage+"话GQ/"+e+".jpg-mht.middle.webp",alt:""},on:{click:function(i){return t.reload(s,"https://mhpic.manhualang.com/comic/D/斗破苍穹拆分版/"+t.queryPage+"话/"+e+".jpg-mht.middle.webp")}}}),i("div",{staticClass:"total-t"},[t._v(t._s(s+1)+" / "+t._s(t.totalImg))])]):t._e()}))],2):t._e(),"斗罗大陆"===this.$route.query.name?i("ul",{ref:"ulDlo",staticClass:"uls doupo-uls"},[t._l(t.totalImg,(function(e,s){return t.pageIndex<600?i("li",{key:t.queryPage+""+e,ref:"dImgList",refInFor:!0,staticClass:"list"},[i("img",{staticClass:"img",attrs:{src:"https://mhpic.manhualang.com/comic/D/斗罗大陆拆分版/"+t.queryPage+"话/"+e+".jpg-mht.middle.webp",alt:""},on:{click:function(i){return t.reload(s,"https://mhpic.manhualang.com/comic/D/斗破苍穹拆分版/"+t.queryPage+"话/"+e+".jpg-mht.middle.webp")}}}),i("div",{staticClass:"total-t"},[t._v(t._s(s+1)+" / "+t._s(t.totalImg))])]):t._e()})),t._l(t.totalImg,(function(e,s){return t.pageIndex>=600?i("li",{key:t.queryPage+""+e,ref:"dImgList",refInFor:!0,staticClass:"list"},[i("img",{staticClass:"img",attrs:{src:"https://mhpic.manhualang.com/comic/D/斗罗大陆拆分版/"+t.queryPage+"话GQ/"+e+".jpg-mht.middle.webp",alt:""},on:{click:function(i){return t.reload(s,"https://mhpic.manhualang.com/comic/D/斗破苍穹拆分版/"+t.queryPage+"话/"+e+".jpg-mht.middle.webp")}}}),i("div",{staticClass:"total-t"},[t._v(t._s(s+1)+" / "+t._s(t.totalImg))])]):t._e()}))],2):t._e(),i("div",{staticClass:"bottom-fixed"},[i("div",{directives:[{name:"show",rawName:"v-show",value:t.imgsArr,expression:"imgsArr"}],staticClass:"current-z"},[t._v(t._s(t.title)+" "),i("span",{staticClass:"page-i"},[t._v(t._s(t.currentPage)+" / "+t._s(t.totalImg))]),t._v("     "+t._s(t.timeHt))]),i("div",{staticClass:"menu-bottom"},[i("div",{staticClass:"list",on:{click:function(e){return e.stopPropagation(),t.showMenu(e)}}},[i("span",[t._v("目录")])]),i("div",{staticClass:"list",on:{click:function(e){return t.gotoPage(-1)}}},[i("span",[t._v("上一话")])]),i("div",{staticClass:"list",on:{click:function(e){return t.gotoPage(1)}}},[i("span",[t._v("下一话")])]),i("div",{staticClass:"list",on:{click:function(e){return e.stopPropagation(),t.lightFn(e)}}},[i("span",[t._v("亮度")])])])]),i("div",{directives:[{name:"show",rawName:"v-show",value:t.dialogMsg,expression:"dialogMsg"}],staticClass:"dialog-msg"},[t._v(t._s(t.dialogMsg))]),i("div",{directives:[{name:"show",rawName:"v-show",value:t.slideShow,expression:"slideShow"}],staticClass:"bg",on:{click:t.closeDialog}}),i("transition",{attrs:{name:"slideleft"}},[i("div",{directives:[{name:"show",rawName:"v-show",value:t.slideShow,expression:"slideShow"}],staticClass:"fixed-left"},[i("div",{staticClass:"catalogue-w"},[i("h3",{staticClass:"menu-title"},[t._v("章节目录")]),i("div",{staticClass:"sequence-w"},[i("span",{staticClass:"sequence",class:{active:t.activeShow},on:{click:function(e){return t.checkFn(!0)}}},[t._v("正序↓")]),i("span",{staticClass:"sequence",class:{active:!t.activeShow},on:{click:function(e){return t.checkFn(!1)}}},[t._v("倒序↑")])])]),i("div",{staticClass:"input-w"},[i("input",{directives:[{name:"model",rawName:"v-model.trim",value:t.pageNumber,expression:"pageNumber",modifiers:{trim:!0}}],staticClass:"input-t",attrs:{type:"text",placeholder:"您想跳转到的位置"},domProps:{value:t.pageNumber},on:{input:[function(e){e.target.composing||(t.pageNumber=e.target.value.trim())},function(e){return t.inputNum("pageNumber")}],blur:function(e){return t.$forceUpdate()}}}),i("div",{staticClass:"link",on:{click:function(e){return t.gotoPage(t.pageNumber,1)}}},[t._v("跳转")])]),"星辰变"===this.$route.query.name?i("ul",{staticClass:"m-uls"},t._l(t.imgData,(function(e,s){return i("li",{key:s,staticClass:"m-list",on:{click:function(e){t.gotoPage(t.indexM(s),2)}}},[t._v("第"+t._s(t.indexM(s))+"话")])})),0):t._e(),"斗破苍穹"===this.$route.query.name||"斗罗大陆"===this.$route.query.name?i("ul",{staticClass:"m-uls"},t._l(t.totalPage,(function(e,s){return i("li",{key:s,staticClass:"m-list",on:{click:function(e){t.gotoPage(t.indexM(s),2)}}},[t._v("第"+t._s(t.indexM(s))+"话")])})),0):t._e()])]),i("transition",{attrs:{name:"slidebottom"}},[i("div",{directives:[{name:"show",rawName:"v-show",value:t.lightShow,expression:"lightShow"}],staticClass:"fixed-bottom"},[i("div",{ref:"progress",staticClass:"prodress",on:{click:t.progressClick}},[i("div",{ref:"progressBtn",staticClass:"solid",on:{touchstart:function(e){return e.preventDefault(),t.progressTouchStart(e)},touchmove:function(e){return e.preventDefault(),t.progressTouchMove(e)}}})]),i("div",{staticClass:"t-n"},[i("span",[t._v("亮")]),i("span",[t._v("暗")])])])])],1)},a=[],o=(i("a481"),i("ac6a"),i("7f7f"),i("c5f6"),{data:function(){return{totalPage:776,douluoPage:647,totalImg:12,timer3:null,lightShow:!1,btnWidth:{type:Number,default:0},touchInfo:{initiated:!1},percent:{default:0},pageX:0,dialogMsg:"",pageNumber:"",slideShow:!1,activeShow:!0,currentPage:1,pageM:0,imgHref:"https://img001.yayxcc.com/images/comic/59/",imgData:i("52e7"),imgsArr:[],timeHt:"",listHeight:[],queryPage:0,queryName:this.$route.query.name,pageIndex:Number(this.$route.params.page)}},watch:{$route:"getRoute"},mounted:function(){var t=this;this.btnWidth=document.getElementsByClassName("prodress")[0].clientWidth,this.queryPage=Number(this.$route.params.page)+1;var e=this;window.onbeforeunload=function(t){e.getLocalStorage()},"斗破苍穹"===this.$route.query.name?this.imgsArr=12:"星辰变"===this.$route.query.name?this.totalImg=this.imgsArr.length:"斗罗大陆"===this.$route.query.name&&(this.totalImg=12,this.imgsArr=12),setTimeout((function(){window.addEventListener("scroll",t.scrollPage)}),2e3)},computed:{title:function(){var t=Number(this.pageIndex)+1;return"第".concat(t," 话")}},created:function(){this.getImg(),this.cutDown()},beforeDestroy:function(){this.getLocalStorage(),clearInterval(this.timer3)},methods:{scrollPage:function(){var t=this,e=document.documentElement.scrollTop||document.body.scrollTop,i=0;if(this.listHeight.push(i),this.$refs.xImgList)this.imgsArr.forEach((function(e,s){i+=500,t.listHeight.push(i)})),this.imgsArr.forEach((function(i,s){var a=t.listHeight[s],o=t.listHeight[s+1];a<=e&&e<o&&(t.currentPage=s+1)}));else if(this.$refs.dImgList){for(var s=0;s<this.totalImg;s++)i+=500,this.listHeight.push(i);for(var a=0;a<this.totalImg;a++){var o=this.listHeight[a],n=this.listHeight[a+1];o<=e&&e<n&&(this.currentPage=a+1)}}},cutDown:function(){var t=this;function e(t){return t<10?"0"+t:t}var i=(new Date).getTime();this.timer3=setInterval((function(){var s=(new Date).getTime();if(s-i>=900){var a=new Date,o=e(a.getDate()),n=e(a.getMonth()+1),r=(a.getFullYear(),e(a.getHours())),l=e(a.getMinutes()),c=e(a.getSeconds());t.timeHt=n+"-"+o+" "+r+":"+l+":"+c}}),1e3)},reload:function(t,e){this.$refs.imgList[t].children[0].src=e},closeDialog:function(){this.slideShow=!1,this.lightShow=!1},lightFn:function(){this.lightShow=!this.lightShow},progressTouchStart:function(t){this.touchInfo.initiated=!0,this.touchInfo.startX=this.$refs.progressBtn.offsetLeft,this.touchInfo.left=this.$refs.progress.clientWidth},progressTouchMove:function(t){this.touchInfo.initiated&&(this.pageX=t.touches[0].pageX,this._setOffset(this.pageX))},progressClick:function(t){this._setOffset(t.offsetX)},_setOffset:function(t){t<0?t=0:t>this.$refs.progress.clientWidth-10&&(t=this.$refs.progress.clientWidth-10),this.$refs.progressBtn.style.left="".concat(t,"px");var e=t/(this.$refs.progress.clientWidth-10);e>.7&&(e=.7),this.$refs.bgM.style.opacity=e},getLocalStorage:function(){"斗破苍穹"===this.$route.query.name?localStorage.setItem("__doupoPage__",this.pageIndex):"星辰变"===this.$route.query.name?localStorage.setItem("__xPage__",this.pageIndex):"斗罗大陆"===this.$route.query.name&&localStorage.setItem("__douluoPage__",this.pageIndex)},goback:function(){this.getLocalStorage(),clearInterval(this.timer3),this.$router.push({path:"/pageList",query:{name:this.$route.query.name}})},indexM:function(t){var e=0;return"斗破苍穹"===this.$route.query.name?e=this.totalPage:"星辰变"===this.$route.query.name?e=this.imgData.length:"斗罗大陆"===this.$route.query.name&&(e=this.douluoPage),!0===this.activeShow?t+1:!1===this.activeShow?e-t:void 0},inputNum:function(t){var e=this[t];/^\d*\.{0,1}\d{0,2}$/.test(e)||(this[t]=e.substring(0,e.length-1)),/^\./.test(this[t])&&(this[t]=""),this.currentIndex=-1,this[t]=this[t].replace(/[^0-9/.]/g,""),this[t]<1?this[t]="":this[t]>this.imgData.length&&"星辰变"===this.queryName?this[t]=this.imgData.length:this[t]>this.totalPage&&"星辰变"===this.queryName?this[t]=this.totalPage:this[t]>this.douluoPage&&"斗罗大陆"===this.queryName&&(this[t]=this.douluoPage)},showMenu:function(){this.slideShow=!0,this.lightShow=!1},checkFn:function(t){this.activeShow=t},getRoute:function(){this.pageM=this.pageIndex+116583,this.imgsArr=this.imgData[this.pageIndex],"星辰变"===this.$route.query.name?this.totalImg=this.imgsArr.length:this.totalImg=12,this.queryPage=Number(this.$route.params.page)+1},getImg:function(){this.pageM=this.pageIndex+116583,this.imgsArr=this.imgData[this.pageIndex]},doupoPage:function(){var t=this;if(1===Number(flag)){var e=776;if(this.pageIndex===e)return this.dialogMsg="没有了，已经是最后一话了",void setTimeout((function(){t.dialogMsg=""}),2e3);page=this.pageIndex+=1}else{if(0===this.pageIndex)return this.dialogMsg="这已经是第一话了",void setTimeout((function(){t.dialogMsg=""}),2e3);page=this.pageIndex-=1}},gotoPage:function(t,e){var i,s=this;if(e)i=Number(t)-1,this.slideShow=!1,this.pageIndex=i,this.pageNumber="";else if(1===Number(t)){if(this.pageIndex===this.imgData.length-1)return this.dialogMsg="没有了，已经是最后一话了",void setTimeout((function(){s.dialogMsg=""}),2e3);i=this.pageIndex+=1}else{if(0===this.pageIndex)return this.dialogMsg="这已经是第一话了",void setTimeout((function(){s.dialogMsg=""}),2e3);i=this.pageIndex-=1}i=Number(i),this.imgsArr=this.imgData[i],this.$router.push({path:"/pages/"+i,query:{name:this.$route.query.name}})}},components:{fixedTop:function(t){return i.e("chunk-09e84078").then(function(){var e=[i("e7d3")];t.apply(null,e)}.bind(this)).catch(i.oe)}}}),n=o,r=(i("8642"),i("2877")),l=Object(r["a"])(n,s,a,!1,null,"3a9aee40",null);e["default"]=l.exports}}]);