let 
  sources = import ./nix/sources.nix;
  pkgs = import sources.nixpkgs {};
  inherit (pkgs.lib) optional optionals;
  mill = import sources.mill;
in pkgs.mkShell {
  buildInputs = [ #mill 
  ];
  MILL_VERSION = "0.9.5";
}
