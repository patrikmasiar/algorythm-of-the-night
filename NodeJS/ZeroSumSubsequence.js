function isArrayWithZeroSumSubsequence(array => {
  let set = new Set();
  set.add(0);
  let sum = 0;
  
  for(let i = 0; i < inputArray.length; i++){
    sum = sum + inputArray[i];
    if(set.has(sum)){
      return true;
    }

    set.add(sum);
  }
  
  return false;
});
