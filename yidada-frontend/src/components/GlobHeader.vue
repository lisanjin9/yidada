<template>
  <a-row id="globHeader" align="center" :wrap="false">
    <a-col flex="auto">
      <a-menu
        mode="horizontal"
        :selected-keys="selectKeys"
        @menu-item-click="doMenuClick"
      >
        <a-menu-item
          key="0"
          :style="{ padding: 0, marginRight: '38px' }"
          disabled
        >
          <div class="titleBar">
            <img class="logo" src="../assets/logo.png" />
            <div class="title">易答测试系统</div>
          </div>
        </a-menu-item>
        <a-menu-item v-for="item in routes" :key="item.path">
          {{ item.name }}
        </a-menu-item>
      </a-menu>
    </a-col>
    <a-col flex="100px">
      <div v-if="useLoginUser.loginUser.id">
        {{ useLoginUser.loginUser.username }}
      </div>
      <div v-else>
        <a-button type="primary" href="/user/login">登录</a-button>
      </div>
    </a-col>
  </a-row>
</template>

<script setup lang="ts">
import { routes } from "@/router/routers";
import { useRouter } from "vue-router";
import { ref } from "vue";
import { useLoginUserStore } from "@/store/UserStore";

const router = useRouter();

// 设置默认的tab栏
const selectKeys = ref(["/"]);

// 点击页面tab栏后 ， 将对应的tab栏设置在more恩的tab栏上，刷新过后还会跳转到该tab栏123
router.afterEach((to) => {
  selectKeys.value = [to.path];
});

// 点击对应的Tab栏跳转到对应的路径上
const doMenuClick = (key: string) => {
  router.push({ path: key });
};

const useLoginUser = useLoginUserStore();
</script>

<style scoped>
#globHeader {
}

.titleBar {
  /*图标文字在同一行*/
  display: flex;
  algin-items: center;
}

.title {
  margin-left: 16px;
  color: black;
}

.logo {
  height: 48px;
}
</style>
