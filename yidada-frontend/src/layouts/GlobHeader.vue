<template>
  <a-row id="globHeader" align="center" :wrap="false">
    <a-col flex="auto">
      <a-menu mode="horizontal" :default-selected-keys="['1']">
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
        <a-menu-item key="1">Home</a-menu-item>
        <a-menu-item key="2">Solution</a-menu-item>
        <a-menu-item key="3">Cloud Service</a-menu-item>
        <a-menu-item key="4">Cooperation</a-menu-item>
      </a-menu>
    </a-col>
    <a-col flex="100px">
      <a-button type="primary" href="/user/login">登录</a-button>
    </a-col>
  </a-row>
</template>

<script></script>

<style scoped>
#globHeader {
}

.titleBar {
  /*图标文字在同一行*/
  display: flex;
  algin-items: center;
}

.title {
  color: black;
  margin-left: 16px;
}

.logo {
  height: 48px;
}
</style>
