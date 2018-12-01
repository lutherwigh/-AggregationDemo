<template>
    <div class="box">
        <div class="box-content">
            你属于:<input type="checkbox" v-for="item in identities" :key="item.iid"/>item.name<input type="radio" />
            预算:
            使用场景:

            
        </div>
    </div>
</template>

<script>
export default {
    data: function(){
        return{
            identity: 0,
            identities:[
                {
                    name: 性能党,
                    iid: 0,
                },
                {
                    name: 颜值党,
                    iid: 1,
                },
                {
                    name: 学生党,
                    iid: 2,
                },
                {
                    name: 商务人士,
                    iid: 3,
                },
                {
                    name:土豪,
                    iid:4
                },
                {
                    name:吃瓜群众,
                    iid:5
                },
            ]
        }
    }
}
</script>

<style>

</style>
