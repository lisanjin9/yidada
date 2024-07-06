<template>
  <div class="home">{{ JSON.stringify(useloginUser.loginUser) }}</div>
</template>

<script setup lang="ts">
import { useLoginUserStore } from "@/store/UserStore";

const useloginUser = useLoginUserStore();
</script>
