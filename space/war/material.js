function loadTexture(texPath) {
  return THREE.ImageUtils.loadTexture(texPath);
}

function pathTexture(filebase, ext) {
  ext = ext || '.jpg';
  return loadTexture('textures/' + filebase + ext);
}

var materials = [];
function cacheMaterial(texPath, ext) {
  var m = materials[name];
  if (!m) {
    var opts = {color: 0xffffff,
                map: pathTexture(texPath, ext),
                wireframe: true};
    m = materials[name] = new THREE.MeshBasicMaterial(opts);
  }
  return m;
}
