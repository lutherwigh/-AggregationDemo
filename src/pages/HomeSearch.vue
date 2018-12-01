<template>
    <div class="">
        <div class="tab-header">
            <div class="header-occupancy">header</div>
        </div>
        
        <div class="tab-bottom">
            <div class="tab-item" v-for="item in tabItems" :key="item.index" :class="activeIndex==item.index?'active-tab':'' " @click="changeTab(item)">
                <div>{{item.name}}</div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "home",
    data: function() {
        return {
            activeIndex: 0,
            tabItems: [
                {
                    index: 0,
                    name: "search",
                    icon: " "
                },
                {
                    index: 1,
                    name: "info",
                    icon: " "
                },
                {
                    index: 2,
                    name: "discuss",
                    icon: " "
                },
                {
                    index: 3,
                    name: "newHome"
                }
            ],
        };
    },
    methods: {
        changeTab: function(item) {
            this.activeIndex = item.index;
            if(item.index == 3) this.goto();
        },
        goto: function(){
            this.$router.push('/homeMuse');
        }
    }
};
</script>

<style lang="less" scoped>
.header-occupancy{
    top: 0;
    width: 100%;
    background: rgb(235, 180, 180); 
    height: 25px;
}
.tab-bottom {
    position: fixed;
    display: flex;
    bottom: 0;
    left : 0;
    width: 100%;
    height: 40px;
    background: rgb(23, 116, 153);
    .tab-item {
        color: white;
        flex: 1;    
        line-height: 2.5;
        text-align: center;
        font-size: 16px;
        border-right: 2px solid rgb(169, 205, 230);
    }
    .active-tab{
        background: rgb(117, 160, 177)
    }
}
</style>
