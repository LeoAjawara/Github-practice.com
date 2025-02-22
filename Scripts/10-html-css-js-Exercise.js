function toggleButton(className, newClass) {
const button = document.querySelector(className);
  if(!button.classList.contains(newClass)) {
    button.classList.add(newClass);
  } else {
    button.classList.remove(newClass);
  }
}
 /*const button = document.querySelector('.js-tech');
if(!button.classList.contains('tech')) {
  button.classList.add('tech');
} else {
  button.classList.remove('tech');
}*/