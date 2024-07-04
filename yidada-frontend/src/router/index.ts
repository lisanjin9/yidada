import { createRouter, createWebHistory } from "vue-router";
import { routes } from "@/router/routers";

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
