import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import yimiao from '@/views/modules/yimiao/list'
    import yimiaoCollection from '@/views/modules/yimiaoCollection/list'
    import yimiaoCommentback from '@/views/modules/yimiaoCommentback/list'
    import yimiaoOrder from '@/views/modules/yimiaoOrder/list'
    import yiyuanxinxi from '@/views/modules/yiyuanxinxi/list'
    import yiyuanxinxiLiuyan from '@/views/modules/yiyuanxinxiLiuyan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryAddress from '@/views/modules/dictionaryAddress/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryYimiao from '@/views/modules/dictionaryYimiao/list'
    import dictionaryYimiaoCollection from '@/views/modules/dictionaryYimiaoCollection/list'
    import dictionaryYimiaoOrder from '@/views/modules/dictionaryYimiaoOrder/list'
    import dictionaryYiyuanxinxi from '@/views/modules/dictionaryYiyuanxinxi/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryAddress',
        name: '地区',
        component: dictionaryAddress
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryYimiao',
        name: '疫苗类型',
        component: dictionaryYimiao
    }
    ,{
        path: '/dictionaryYimiaoCollection',
        name: '收藏表类型',
        component: dictionaryYimiaoCollection
    }
    ,{
        path: '/dictionaryYimiaoOrder',
        name: '订单类型',
        component: dictionaryYimiaoOrder
    }
    ,{
        path: '/dictionaryYiyuanxinxi',
        name: '医院类型',
        component: dictionaryYiyuanxinxi
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/yimiao',
        name: '疫苗信息',
        component: yimiao
      }
    ,{
        path: '/yimiaoCollection',
        name: '疫苗收藏',
        component: yimiaoCollection
      }
    ,{
        path: '/yimiaoCommentback',
        name: '疫苗评价',
        component: yimiaoCommentback
      }
    ,{
        path: '/yimiaoOrder',
        name: '疫苗预约',
        component: yimiaoOrder
      }
    ,{
        path: '/yiyuanxinxi',
        name: '医院信息',
        component: yiyuanxinxi
      }
    ,{
        path: '/yiyuanxinxiLiuyan',
        name: '医院留言',
        component: yiyuanxinxiLiuyan
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
