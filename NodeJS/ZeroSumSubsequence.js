function isArrayWithZeroSumSubsequence(array => {
  let set = new Set();
  set.add(0);
  let sum = 0;
  
  for(let i = 0; i < array.length; i++){
    sum = sum + array[i];
    if(set.has(sum)){
      return true;
    }

    set.add(sum);
  }
  
  return false;
});
