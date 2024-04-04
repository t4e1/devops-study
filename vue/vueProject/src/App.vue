<script setup>
  import { ref } from 'vue';
  
  const num1 = ref(0);
  const num2 = ref(0);
  const result = ref(0);

  const sendPlus = async() => {

    /* 백엔드를 도커 컨테이너로 8055포트로 만들었을 때 */
    // const response = await fetch(`http://localhost:8055/plus?num1=${num1.value}&num2=${num2.value}`);

    /* 직접 연결 시 (백에서 CORS처리) */
    // const response = await fetch(`http://localhost:7777/plus?num1=${num1.value}&num2=${num2.value}`);

    /* 직접 연결 시 (프론트에서 proxy 로 CORS 처리) */
    // const response = await fetch(`http://localhost:5173/api/plus?num1=${num1.value}&num2=${num2.value}`);

    /* 도커 컨테이너 안에 네트워크 연결 후 (5173/api가 아니라 8011/api로 바꿔야 된다.) */
    const response = await fetch(`http://localhost:8011/api/plus?num1=${num1.value}&num2=${num2.value}`);
    const data = await response.json();
    result.value = data.sum;
  }
</script>``

<template>
  <div class="plus">
    <h1>덧셈 기능 만들기</h1>
    <label>num1: </label><input type="text" v-model="num1">&nbsp;
    <label>num2: </label><input type="text" v-model="num2">&nbsp;
    <button @click="sendPlus">더하기</button>
    <hr>
    <p>`{{ num1 }} + {{ num2 }} = {{ result }}`</p>
  </div>
</template>

<style scoped>
  .plus{
    text-align: center;
  }
</style>
