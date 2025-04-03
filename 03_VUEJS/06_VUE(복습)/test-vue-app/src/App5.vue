<template>
  <div>
    <Sender />
    <hr />
    <Receiver />
  </div>
</template>
<script>
import Receiver from './components/REceiver.vue';
import Sender from './components/Sender.vue';
export default {
  name: 'App5',
  components: { Sender, Receiver },
};
</script>
