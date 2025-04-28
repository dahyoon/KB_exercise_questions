<template>
  <div class="container">
    <router-link to="/">Home</router-link> <br />
    <router-link to="/login">Login</router-link> <br />
    <router-link to="/users">Users</router-link> <br />
    <router-link to="/admins">Admins</router-link>
  </div>
  <hr />
  <div>
    <router-view />
  </div>
</template>

<script>
export default {
  name: 'App',
}
</script>

<style>
.container {
  margin: 10px;
}
</style>
