<template>
  <div id="basicLayout">
    <a-layout style="height: 100vh">
      <a-layout-header class="header">
        <GlobHeader />
      </a-layout-header>
      <a-layout-content class="content">
        <router-view />
      </a-layout-content>
      <a-layout-footer class="footer">
        <a href="https://lisanjin9.top" target="_blank"> 个人博客 </a>
      </a-layout-footer>
    </a-layout>
  </div>
</template>

<script lang="ts" setup>
import GlobHeader from "@/components/GlobHeader.vue";
</script>
<style scoped>
#basicLayout {
}

#basicLayout .header {
  margin-bottom: 16px;
  box-shadow: #eee 1px 1px 5px;
}

#basicLayout .content {
  margin-bottom: 28px;
  padding: 20px;
  background: linear-gradient(to right, #fefefe, blueviolet);
}

.footer {
  padding: 16px;
  text-align: center;
  text-decoration: none;
  background-color: #efefef;
}
</style>
