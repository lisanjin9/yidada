<template>
  <div class="home">{{ JSON.stringify(loginUserStore.loginUser) }}</div>
</template>

<script setup lang="ts">
import { useLoginUserStore } from "@/store/UserStore";

const loginUserStore = useLoginUserStore();
</script>
