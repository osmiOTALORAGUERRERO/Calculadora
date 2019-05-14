let text = document.querySelectorAll('.text p')[0]

let nums = document.getElementsByName('num')
nums.forEach((element) => {
  element.addEventListener('click', () => {
    addToExpression(element.id)
  }, false)
})

let signs = document.getElementsByName('sign')
signs.forEach((element) => {
  element.addEventListener('click', () => {
    addToExpression(element.id)
  }, false)
})

let del = document.getElementById('Del')
let ac = document.getElementById('AC')
let equal = document.getElementById('=')

del.addEventListener('click', delValue, false)
ac.addEventListener('click', acExpression, false)
equal.addEventListener('click', result, false)

function delValue (event) {
  if (text.innerHTML.length === 1 & text.innerHTML !== '0') {
    text.innerHTML = '0'
  } else if (text.innerHTML.length > 1) {
    let expression = text.innerHTML
    text.innerHTML = expression.slice(0, expression.length - 1)
  }
}

function acExpression (event) {
  text.innerHTML = '0'
}

function result (event) {
  let op = text.innerHTML
  let res
  try {
    res = math.eval(text.innerHTML)
  } catch (e) {
    window.alert('Error expression')
    return
  }
  console.log(res)
  console.log(op)
  if (res === Infinity) {
    window.alert('Can not be divided by zero')
  } else {
    text.innerHTML = res
  }
}

function addToExpression (value) {
  if (text.innerHTML === '0') {
    text.innerHTML = value
  } else {
    text.innerHTML += value
  }
}
